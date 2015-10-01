import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pkiprototype_sample_unknownuser_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sample/_unknownuser.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(certfirst)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('field','g',6,['type':("text"),'name':("firstName"),'readonly':("readonly"),'value':(certfirst)],-1)
printHtmlPart(3)
invokeTag('field','g',8,['type':("text"),'name':("lastName"),'readonly':("readonly"),'value':(certlast)],-1)
printHtmlPart(4)
invokeTag('field','g',10,['type':("text"),'name':("emailAddress"),'readonly':("readonly"),'value':(certmail)],-1)
printHtmlPart(5)
invokeTag('actionSubmit','g',12,['value':("Save"),'action':("createUser")],-1)
printHtmlPart(6)
})
invokeTag('form','g',13,['name':("newUser")],1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1443565152000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
