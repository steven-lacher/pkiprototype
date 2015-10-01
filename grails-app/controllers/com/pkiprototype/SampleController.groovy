package com.pkiprototype

import grails.plugins.springsecurity.Secured
import java.security.cert.X509Certificate


class SampleController {

	def springSecurityService
	def certobject
	def utilityService

	
		def User = {

			def currentUser = springSecurityService.getCurrentUser ()
			render "Welcome user:"  +   currentUser.username + "\n Your role is:" + currentUser.getAuthorities ()
		}



	@Secured(['permitAll'])
	def index() {
		log.info("<<<<entered index<<<<")
		//certinfo = request['javax.servlet.request.X509Certificate']
		certobject = request.getAttribute("javax.servlet.request.X509Certificate")
		def certinfo

		def user = springSecurityService.currentUser
		def certfirst
		def certlast
		def certmail

		if (certobject != null){
			X509Certificate[] certs = (X509Certificate[]) certobject
			X509Certificate cert = certs[0]
			certinfo = cert.getSubjectDN().getName()
			String[] certsplit = certinfo.split(",")
			certsplit.each {value ->
				if (value.contains("EMAILADDRESS=")){
					def splitval = value.split("=")
					certmail=splitval[1]
				}
				if (value.contains("CN=")){
					//set certfirst & certlast
					def splitval=value.split("=")
					log.info("CN VALUE:" +splitval[0])
					def splitname=splitval[1].split(" ")
					certfirst = splitname[0]
					certlast  = splitname[1]
				}
			}
		}

		[certinfo:certinfo, user:user,certfirst:certfirst,certlast:certlast,certmail:certmail ]

	}

	@Secured(['permitAll'])
	def createUser(){
		log.info("<<<<entered createUser<<<<")
		log.info(params)
		def user = new User(params)
		def generatedPassword = utilityService.generatePassword(params.emailAddress)
		println("<<<<<<<<<<PASSWORD:" + generatedPassword +">>>>>>>>>>")
		//println("PASSWORD:" + params.emailAddress)
		//user.username = params.firstName + " " +params.lastName
		user.password= generatedPassword
		user.save()
		redirect action: 'index'
		//render "Good to go"

	}
}
