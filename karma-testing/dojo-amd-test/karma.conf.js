// Karma configuration
// Generated on Sat Mar 01 2014 06:44:46 GMT-0500 (EST)

module.exports = function(config) {
  config.set({

    // base path, that will be used to resolve files and exclude
    basePath: '',


    // frameworks to use
    frameworks: ['jasmine', 'dojo'],


    // list of files / patterns to load in the browser
    files: [
       // setup - including packages
       'src/test/js/test-main.js',

       // some dependencies
       {pattern: 'http://code.jquery.com/jquery-1.8.3.min.js', watched: false, served: true, included: true},
       {pattern: 'http://cloud.github.com/downloads/velesin/jasmine-jquery/jasmine-jquery-1.3.1.js', watched: false, served: true, included: true},


       // js source - loaded as dojo modules
       {pattern: 'src/main/js/**/*.js', included:false},

       // test files
       {pattern: 'src/test/js/**/*Spec.js', included:false},
       
       // fixtures	
       {pattern: 'src/test/fixtures/**/*.html', included:false}
    ],

    preprocessors: {
        '**/.html': [],
        'src/main/js/**/*.js': ['coverage']
    },

    coverageReporter: {
	reporters:[
    		{type: 'html', dir:'test-results/coverage/html/'},
        	{type: 'cobertura', dir:'test-results/coverage/cobertura/'},
	    	{type: 'text-summary', dir:'test-results/coverage/',file:'coverage-summary.txt'}
		]

    },
    
    junitReporter: {
      outputFile: 'test-results/test-results-junit.xml',
      suite: ''
    }, 
    
    // list of files to exclude
    exclude: [
      
    ],


    // test results reporter to use
    // possible values: 'dots', 'progress', 'junit', 'growl', 'coverage'
    reporters: ['progress', 'dots', 'junit', 'coverage'],


    // web server port
    port: 9876,


    // enable / disable colors in the output (reporters and logs)
    colors: true,


    // level of logging
    // possible values: config.LOG_DISABLE || config.LOG_ERROR || config.LOG_WARN || config.LOG_INFO || config.LOG_DEBUG
    logLevel: config.LOG_INFO,


    // enable / disable watching file and executing tests whenever any file changes
    autoWatch: true,


    // Start these browsers, currently available:
    // - Chrome
    // - ChromeCanary
    // - Firefox
    // - Opera (has to be installed with `npm install karma-opera-launcher`)
    // - Safari (only Mac; has to be installed with `npm install karma-safari-launcher`)
    // - PhantomJS
    // - IE (only Windows; has to be installed with `npm install karma-ie-launcher`)
    browsers: ['Chrome'],


    // If browser does not capture in given timeout [ms], kill it
    captureTimeout: 60000,


    // Continuous Integration mode
    // if true, it capture browsers, run tests and exit
    singleRun: false
  });
};
