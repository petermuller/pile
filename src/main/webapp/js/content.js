/**
 * content.js
 *
 * Methods for getting and displaying content on the site.
 * @author pmuller
 */

function getAbout(){
	$.getJSON("pages/about.json",function(data){
		$("#mainTitle").html(data.title);
		$("#mainDesc").html(data.shortDesc);
	});
}

function getHome(){
	$.getJSON("pages/home.json",function(data){
		$("#mainTitle").html(data.title);
		$("#mainDesc").html(data.shortDesc);
	});
}

function getMore(){
	$.getJSON("pages/more.json",function(data){
		$("#mainTitle").html(data.title);
		$("#mainDesc").html(data.shortDesc);
	});
}

function getProjects(){
	$.getJSON("pages/projects.json",function(data){
		$("#mainTitle").html(data.title);
		$("#mainDesc").html(data.shortDesc);
	});
}

function getResume(){
	$.getJSON("pages/resume.json",function(data){
		$("#mainTitle").html(data.title);
		$("#mainDesc").html(data.shortDesc);
	});
}

function testConnection(){
	$.getJSON("rest/v1/ping",function(data){
		$("#connectionResponse").html(data.resp);
	});
}
