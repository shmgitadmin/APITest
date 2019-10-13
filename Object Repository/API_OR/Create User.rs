<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create User</name>
   <tag></tag>
   <elementGuidId>5e7fd40f-dcfc-4450-9afd-7c5f36bae925</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: ${nid},\n  \&quot;title\&quot;: \&quot;Title ${nid}\&quot;,\n  \&quot;author\&quot;: \&quot;Author ${nid}\&quot;,\n  \&quot;email\&quot;: \&quot;email@Test.com\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://localhost:3000/posts?id=${nid}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.nid</defaultValue>
      <description></description>
      <id>1c86e7c1-54ed-45bb-9ea2-a2cfb00a4031</id>
      <masked>false</masked>
      <name>nid</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.nit</defaultValue>
      <description></description>
      <id>45636e50-2f6f-4f22-bfb9-bbd88a058f6b</id>
      <masked>false</masked>
      <name>nit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.nia</defaultValue>
      <description></description>
      <id>b10a97c1-1064-4c29-adc6-6b33afd297a0</id>
      <masked>false</masked>
      <name>nia</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.nie</defaultValue>
      <description></description>
      <id>193a8c5d-e836-47b1-97b3-494c0b63efcc</id>
      <masked>false</masked>
      <name>nie</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()



assertThat(response.getStatusCode()).isIn(Arrays.asList(200, 201, 202))</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
