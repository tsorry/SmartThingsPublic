metadata {
 	definition (name: "Alarm Clock Advanced Version", namespace: "SmartThings", author: "Robin Winbounre") {
 		capability "Actuator"
 		capability "Switch"
 		capability "Sensor"
        attribute "alarm","string"
        attribute "Monday", "string"
        attribute "Tuesday", "string"
        attribute "Wednesday", "string"
        attribute "Thursday", "string"
        attribute "Friday", "string"
        attribute "Saturday", "string"
        attribute "Sunday", "string"
        attribute "Snooze", "string"
        attribute "SnoozeDuration", "string"
        attribute "alarmStatus", "string"
        attribute "Wake", "string"
        attribute "hUp", "string"
        attribute "hDown", "string"
        attribute "mUp", "string"
        attribute "mDown", "string"
        command "changeAlarmTime"
        command "changeSnoozeDuration"
        command "changeAlarmStatus"
        command "Monday_On"
        command "Monday_Off"
        command "Tuesday_On"
        command "Tuesday_Off"
        command "Wednesday_On"
        command "Wednesday_Off"
        command "Thursday_On"
        command "Thursday_Off"
        command "Friday_On"
        command "Friday_Off"
        command "Saturday_On"
        command "Saturday_Off"
        command "Sunday_On"
        command "Sunday_Off"
        command "Snooze_On"
        command "Snooze_Off"
        command "Wake"
        command "hUp"
        command "hDown"
        command "mUp"
        command "mDown"
     }
     preferences {
     input name: "timer", type: "time", title: "Alarm Time", description: "Enter Time", required: false
     input name: "snoozeDuration", type: "number", title: "Snooze Duration", description: "Enter Snooze Duration (Minutes)", required: false
 	}

 	// UI tile definitions
 	tiles {
 		multiAttributeTile(name:"switch", type: "generic", width: 3, height: 3, canChangeIcon: true, canChangeBackground: false){
			tileAttribute ("device.switch", key: "PRIMARY_CONTROL") {
 			attributeState "off", label: 'off', action: "switch.on", icon: "st.Office.office6", backgroundColor: "#ffffff"
 			attributeState "on", label: 'on', action: "switch.off", icon: "st.Office.office6", backgroundColor: "#e86d13"
 		}
        	tileAttribute("device.alarmStatus", key: "SECONDARY_CONTROL") {
            attributeState("alarmStatus", label:'Status: \n${currentValue}', defaultState: true)
        }
  
        }
        standardTile("hUp", "device.hUp", inactiveLabel: false, decoration: "flat", width: 2, height: 1) {
            state "default", label:"", action:"hUp", icon:"st.samsung.da.oven_ic_up"
        }
        standardTile("hDown", "device.hDown", inactiveLabel: false, decoration: "flat", width: 2, height: 1) {
            state "default", label:"", action:"hDown", icon:"st.samsung.da.oven_ic_down"
        }
 		valueTile("alarm", "device.alarm", width: 2, height: 2) {
 			state "default", label:'Set for: \n${currentValue}'
 		}
        standardTile("mUp", "device.mUp", inactiveLabel: false, decoration: "flat", width: 2, height: 1) {
            state "default", label:"", action:"mUp", icon:"st.samsung.da.oven_ic_up"
        }
        standardTile("mDown", "device.mDown", inactiveLabel: false, decoration: "flat", width: 2, height: 1) {
            state "default", label:"", action:"mDown", icon:"st.samsung.da.oven_ic_down"
        }
        standardTile("Wake", "device.Wake", inactiveLabel: false, decoration: "flat", width: 3, height: 2) {
            state "default", label:"", action:"Wake", icon:"https://cdn.rawgit.com/RobinWinbourne/devicetypes/master/Wake_Button.png"
        }
        standardTile("Snooze", "device.Snooze", inactiveLabel: false, decoration: "flat", width: 3, height: 2) {
            state "on", label:"", action:"", icon:"https://cdn.rawgit.com/RobinWinbourne/devicetypes/master/Snooze_Button_On_Orange.png"//, backgroundColor: "#e86d13"
            state "off", label:"", action:"Snooze_On", icon:"https://cdn.rawgit.com/RobinWinbourne/devicetypes/master/Snooze_Button.png"//, backgroundColor: "#ffffff"
        }
        standardTile("Monday", "device.Monday", decoration: "flat",canChangeIcon: true, width: 2, height: 2) {
		state "on", label: "Mon", action: "Monday_Off", icon: "st.Office.office6", backgroundColor: "#00A0DC"
		state "off", label: "Mon", action: "Monday_On", icon: "st.Bedroom.bedroom2", backgroundColor: "#ffffff"
    }
        standardTile("Tuesday", "device.Tuesday", decoration: "flat",canChangeIcon: true, width: 2, height: 2) {
		state "on", label: "Tue", action: "Tuesday_Off", icon: "st.Office.office6", backgroundColor: "#00A0DC"
		state "off", label: "Tue", action: "Tuesday_On", icon: "st.Bedroom.bedroom2", backgroundColor: "#ffffff"
    }
   		standardTile("Wednesday", "device.Wednesday", decoration: "flat",canChangeIcon: true, width: 2, height: 2) {
		state "on", label: "Wed", action: "Wednesday_Off", icon: "st.Office.office6", backgroundColor: "#00A0DC"
		state "off", label: "Wed", action: "Wednesday_On", icon: "st.Bedroom.bedroom2", backgroundColor: "#ffffff"
    }
   		standardTile("Thursday", "device.Thursday", decoration: "flat",canChangeIcon: true, width: 2, height: 2) {
		state "on", label: "Thu", action: "Thursday_Off", icon: "st.Office.office6", backgroundColor: "#00A0DC"
		state "off", label: "Thu", action: "Thursday_On", icon: "st.Bedroom.bedroom2", backgroundColor: "#ffffff"
    }
   		standardTile("Friday", "device.Friday", decoration: "flat",canChangeIcon: true, width: 2, height: 2) {
		state "on", label: "Fri", action: "Friday_Off", icon: "st.Office.office6", backgroundColor: "#00A0DC"
		state "off", label: "Fri", action: "Friday_On", icon: "st.Bedroom.bedroom2", backgroundColor: "#ffffff"
    }
   		standardTile("Saturday", "device.Saturday", decoration: "flat",canChangeIcon: true, width: 2, height: 2) {
		state "on", label: "Sat", action: "Saturday_Off", icon: "st.Office.office6", backgroundColor: "#00A0DC"
		state "off", label: "Sat", action: "Saturday_On", icon: "st.Bedroom.bedroom2", backgroundColor: "#ffffff"
    }
   		standardTile("Sunday", "device.Sunday", decoration: "flat",canChangeIcon: true, width: 2, height: 2) {
		state "on", label: "Sun", action: "Sunday_Off", icon: "st.Office.office6", backgroundColor: "#00A0DC"
		state "off", label: "Sun", action: "Sunday_On", icon: "st.Bedroom.bedroom2", backgroundColor: "#ffffff"
    }
    	valueTile("snoozeDuration", "device.snoozeDuration", width: 4, height: 2) {
 			state "default", label:'Snooze Duration \n ${currentValue} minutes'
 		}
 		main(["switch","alarm"])
 		details(["switch","hUp","alarm","mUp","hDown","mDown","Wake","Snooze","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","snoozeDuration"])
 	}
 }
 def parse() {
 }
 def updated() {
        def time = timer.substring(11,16)
         def tz = location.timeZone
 		def schedTime = time //Today(timer, tz)
 		//def ntime = schedTime.format("H",tz)
 		//def min = schedTime.format("m",tz)
         //def newtime = schedTime.format('HH:mm:ss', tz).toString()
     if(timer) {
     		log.debug "Alarm time set to: $timer"
            // sendEvent("name":"image", "value":schedTime)
             sendEvent("name":"alarm", "value":time)
     } else {
     		log.debug "No departure time is set"
     		}
            
     //  def snooze = snoozeDuration.substring
       sendEvent("name":"snoozeDuration", "value":snoozeDuration)
       
 }
 def on(){
 sendEvent(name:"switch",value:"on")
 sendEvent("name":"alarmStatus", "value":"Standby")
 }
 def off(){
 sendEvent(name:"switch",value:"off")
 sendEvent(name:"Snooze",value:"off")
 } 
 def changeAlarmTime(paramTime) {
    sendEvent("name":"alarm", "value":paramTime)
}
def changeSnoozeDuration(paramSnooze) {
    sendEvent("name":"snoozeDuration", "value":paramSnooze)
}
def changeAlarmStatus(paramStatus) {
    sendEvent("name":"alarmStatus", "value":paramStatus)
}
def Monday_On(){
 sendEvent(name:"Monday",value:"on")
 sendEvent(name:"switch",value:"on")
 }
 def Monday_Off(){
 sendEvent(name:"Monday",value:"off")
 } 
def Tuesday_On(){
 sendEvent(name:"Tuesday",value:"on")
 sendEvent(name:"switch",value:"on")
 }
 def Tuesday_Off(){
 sendEvent(name:"Tuesday",value:"off")
 } 
def Wednesday_On(){
 sendEvent(name:"Wednesday",value:"on")
 sendEvent(name:"switch",value:"on")
 }
 def Wednesday_Off(){
 sendEvent(name:"Wednesday",value:"off")
 } 
def Thursday_On(){
 sendEvent(name:"Thursday",value:"on")
 sendEvent(name:"switch",value:"on")
 }
 def Thursday_Off(){
 sendEvent(name:"Thursday",value:"off")
 } 
def Friday_On(){
 sendEvent(name:"Friday",value:"on")
 sendEvent(name:"switch",value:"on")
 }
 def Friday_Off(){
 sendEvent(name:"Friday",value:"off")
 } 
def Saturday_On(){
 sendEvent(name:"Saturday",value:"on")
 sendEvent(name:"switch",value:"on")
 }
 def Saturday_Off(){
 sendEvent(name:"Saturday",value:"off")
 } 
def Sunday_On(){
 sendEvent(name:"Sunday",value:"on")
 sendEvent(name:"switch",value:"on")
 }
 def Sunday_Off(){
 sendEvent(name:"Sunday",value:"off")
 } 
 def Snooze_On(){
 if (device.currentValue("alarmStatus").contains("Active") ){
     sendEvent(name:"Snooze",value:"on",isStateChange: true)
     }  else {refresh.refresh
     		}
 } 
  def Snooze_Off(){
     sendEvent(name:"Snooze",value:"off",isStateChange: true)
 } 
  def Wake(){
     sendEvent(name:"Wake",value:"on", isStateChange: true)
 }
  def hUp(){
 sendEvent(name:"hUp",value:"on", isStateChange: true)
 } 
 def hDown(){
 sendEvent(name:"hDown",value:"on", isStateChange: true)
 }
  def mUp(){
 sendEvent(name:"mUp",value:"on", isStateChange: true)
 } 
 def mDown(){
 sendEvent(name:"mDown",value:"on", isStateChange: true)
 }