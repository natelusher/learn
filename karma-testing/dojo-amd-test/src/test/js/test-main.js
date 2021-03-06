var allTestFiles = [];
var TEST_REGEXP = /Spec.*\.js$/;

Object.keys(window.__karma__.files).forEach(function(file) {
	    if (TEST_REGEXP.test(file)) {
		            allTestFiles.push(file);
			        }
});

var dojoConfig = {
    async: true,
    //baseUrl: "http://localhost:9876/base/src",
    tlmSiblingOfDojo: false,
    packages: [
            { name: "dojo", location: "http://ajax.googleapis.com/ajax/libs/dojo/1.9.2/dojo" },
            { name: "dijit", location: "http://ajax.googleapis.com/ajax/libs/dojo/1.9.2/dijit" },
            { name: "dojox", location: "http://ajax.googleapis.com/ajax/libs/dojo/1.9.2/dojox" },
            { name: "my", location: "/base/src/main/js/my" }
   ]
};


/**
 *  * This function must be defined and is called back by the dojo adapter
 *    * @returns {string} a list of dojo spec/test modules to register with your testing framework
 *     */
window.__karma__.dojoStart = function(){
	    return allTestFiles;
}

