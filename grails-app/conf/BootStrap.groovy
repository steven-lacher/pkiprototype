import com.pkiprototype.*

class BootStrap {

    def init = { servletContext ->
		def adminRole = Role.findOrSaveWhere(authority:'ROLE_ADMIN')
		//def superadminRole = Role.findOrSaveWhere(authority:'ROLE_SUPERADMIN')
		

		def user = User.findOrSaveWhere(
//				username:'Steven Lacher',
				password:'password',
				firstName:'Steven',
				lastName:'Lacher',
				emailAddress:'slacher@bcmcgroup.com')

//		def user2 = User.findOrSaveWhere(
//				username:'Carl Angoli',
//				password:'password',
//				firstName:'Carl',
//				lastName:'Angoli',
//				emailAddress:'carl.angoli@xorsecurity.com')

		def user3 = User.findOrSaveWhere(
//				username:'iris',
				password:'password',
				firstName:'Iris',
				lastName:'West',
				emailAddress:'annoying@picturenews.com')


		if(!user.authorities.contains(adminRole) ){
			UserRole.create(user,adminRole,true)
		}

//		User.withSession {
//			it.flush()
//			it.clear()
//		}

//		println "User: ${User.count()}"
//		println "Role: ${Role.count()}"
//		println "UserRole: ${UserRole.count()}"
//
//		def slacher = User.findByEmailAddress('slacher@bcmcgroup.com')
//		println "Granted roles: ${UserRole.findAllByUser(slacher)*.role}"
    }
    def destroy = {
    }
}
