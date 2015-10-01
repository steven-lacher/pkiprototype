import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pkiprototype_sampleindex_old_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sample/index_old.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',82,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(certinfo)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('username','sec',90,[:],-1)
printHtmlPart(8)
expressionOut.print(user.firstName)
printHtmlPart(9)
expressionOut.print(user.lastName)
printHtmlPart(10)
expressionOut.print(user.emailAddress)
printHtmlPart(11)
expressionOut.print(user.username)
printHtmlPart(12)
})
invokeTag('ifLoggedIn','sec',106,[:],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
expressionOut.print(certfirst)
printHtmlPart(15)
expressionOut.print(certfirst)
printHtmlPart(16)
expressionOut.print(certlast)
printHtmlPart(17)
expressionOut.print(certmail)
printHtmlPart(18)
})
invokeTag('ifNotLoggedIn','sec',124,[:],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',124,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443041273000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
