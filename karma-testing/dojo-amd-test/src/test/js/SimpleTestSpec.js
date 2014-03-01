define(["my/Simple"],function(Simple) {
	
describe("A suite", function() {
	  it("contains spec with an expectation", function() {
	      expect(true).toBe(true);
          });
	  it("Should be simple", function() {
		expect(Simple.isSimple()).toBe(true);
	  });
});

});
