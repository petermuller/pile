/*
 * contentTest.js
 * Unit tests for JavaScript coverage.
 *
 * @author pmuller
 */

describe("contentTest.js Tests", function(){

	it("Test getAbout()", function(){
		expect(getAbout()).toBe(undefined);
	});

	it("Test getHome()", function(){
		expect(getHome()).toBe(undefined);
	});

	it("Test getMore()", function(){
		expect(getMore()).toBe(undefined);
	});

	it("Test getProjects()", function(){
		expect(getProjects()).toBe(undefined);
	});

	it("Test getResume()", function(){
		expect(getResume()).toBe(undefined);
	});

	it("Test testConnection()", function(){
		expect(testConnection()).toBe(undefined);
	});

});
