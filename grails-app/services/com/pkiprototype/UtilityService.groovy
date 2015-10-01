package com.pkiprototype

import grails.transaction.Transactional

@Transactional
class UtilityService {

    def generatePassword(String useremail) {
        def generator = { String alphabet, int n ->
            new Random().with {
                (1..n).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
            }
        }

        def token = generator( (('A'..'Z')+('0'..'9')).join(), 15 )



        def uTok = useremail + "${token}"

        return uTok
    }
}
