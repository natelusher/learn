package simple

class HelloController {

    def list() { 
      	render "hello ${params.helloTo}" 
	}

    def hello() { 
    	render "hello" 
    }	

    def helloRedir() { 
    	redirect action:"hello" 
    }	
}
