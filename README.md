# Apache Cordova SMS Android plugin
By Andreas Daskalopoulos

## Using the plugin

* Add java code to your project's build source

* Register the plugin in the plugins.xml file

```xml
<plugin name="SmsPlugin" value="com.phonegap.plugins.sms.SmsPlugin" />
```

* Copy javascript and use the <script> tag

<script type="text/javascript" charset="utf-8" src="sms.js" />

* Call the plugin, specifying phone and message

window.plugins.sms.send(phone, message);



