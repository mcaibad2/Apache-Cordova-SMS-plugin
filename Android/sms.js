/**
 * Usage:
 * 
 * window.plugins.sms.send('6946712098', 'Hello from Android');
 */
cordova.define("cordova/plugin/sms", function (require, exports, module) {
    var exec = require("cordova/exec");

    function Sms() {}
    
    Sms.prototype.send = function (number, text, successCallback, failureCallback) {
        exec(successCallback, failureCallback, 'SmsPlugin', 'send', [number, text]);
    };
    
    var sms = new Sms();
    module.exports = sms;
});

if (!window.plugins) {
    window.plugins = {};
}

if (!window.plugins.Sms) {
    window.plugins.sms = cordova.require("cordova/plugin/sms");
}