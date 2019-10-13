<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get_Post</name>
   <tag></tag>
   <elementGuidId>8329d198-e128-4294-baf9-cd56d4df28bd</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://localhost:3000/posts?id=${nid}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.nid</defaultValue>
      <description></description>
      <id>17cbe877-e8ae-49f3-8d80-9127e1c109dc</id>
      <masked>false</masked>
      <name>nid</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.nia</defaultValue>
      <description></description>
      <id>6b05487a-4b1b-44e2-a497-55dac5b584f6</id>
      <masked>false</masked>
      <name>nia</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.nit</defaultValue>
      <description></description>
      <id>8b8f0b49-2f7f-44db-af9a-02c7b7b9ecbf</id>
      <masked>false</masked>
      <name>nit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.nie</defaultValue>
      <description></description>
      <id>50952284-67ff-48a6-9f5b-3cbf355a9d8e</id>
      <masked>false</masked>
      <name>nie</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
