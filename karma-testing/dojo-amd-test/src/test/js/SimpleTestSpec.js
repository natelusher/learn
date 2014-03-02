define(["my/Simple"],function(Simple) {
	
describe("A suite", function() {
	beforeEach(function() {
	        var f = jasmine.getFixtures();
        	f.fixturesPath = 'base/src/test/fixtures';
	        f.load('testFixture.html');
        });
        afterEach(function() {
            var f = jasmine.getFixtures();
	    f.cleanUp();
	    f.clearCache();
	});
	
	it("contains spec with an expectation", function() {
	    expect(true).toBe(true);
        });
	
	it("Should be simple", function() {
	    expect(Simple.isSimple()).toBe(true);
	});

	it("Should load the fixture", function() {
	    expect($('#bar').html()).toBe('hello world');
        });
});

});
