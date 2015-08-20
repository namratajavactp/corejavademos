var skeywords = '';
var excludeurl = document.location.href.substring(8);
excludeurl = excludeurl.substring(excludeurl.indexOf('/'));
var metaArray = document.getElementsByName('keywords');
if(metaArray[0]) skeywords = hbxStrip(metaArray[0].content);
if (skeywords != '') {document.write('<a href=\"http://search.networkworld.com/nextlink/query.html?col=java&nh=1&qp=' + skeywords + '%20-url:' + excludeurl + '\" class=\"rel\">Related Article</a>');}