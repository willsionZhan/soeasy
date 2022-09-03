!function(e){"use strict";"function"==typeof define&&define.amd?define(["jquery","./grid.base","./grid.grouping"],e):e(jQuery)}(function(Q){"use strict";Q.assocArraySize=function(e){var r,o=0;for(r in e)e.hasOwnProperty(r)&&o++;return o},Q.jgrid.extend({pivotSetup:function(F,e){var H=[],A=[],k=[],G=[],M=[],z={grouping:!0,groupingView:{groupField:[],groupSummary:[],groupSummaryPos:[]}},V=[],q=Q.extend({rowTotals:!1,rowTotalsText:"Total",colTotals:!1,groupSummary:!0,groupSummaryPos:"header",frozenStaticCols:!1},e||{});return this.each(function(){var d,f,p,e,r,c=this,o=F.length,t=0;function i(e,r,o){e=function(e,r){var o,t,i,n=[];if(!this||"function"!=typeof e||e instanceof RegExp)throw new TypeError;for(i=this.length,o=0;o<i;o++)if(this.hasOwnProperty(o)&&(t=this[o],e.call(r,t,o,this))){n.push(t);break}return n}.call(e,r,o);return 0<e.length?e[0]:null}function n(e,r){var o,t=0,i=!0;for(o in e)if(e.hasOwnProperty(o)){if(e[o]!=this[t]){i=!1;break}if(++t>=this.length)break}return i&&(b=r),i}function a(e,r,o,t){var i,n,a,l,s=r.length,g="",u=[],m=1;for(Array.isArray(o)?(a=o.length,u=o):(a=1,u[0]=o),M=[],n=(G=[]).root=0;n<a;n++){for(var d,f=[],p=0;p<s;p++){if(l="string"==typeof r[p].aggregator?r[p].aggregator:"cust",null==o)d=i=Q.jgrid.trim(r[p].member)+"_"+l,u[0]=r[p].label||l+" "+Q.jgrid.trim(r[p].member);else{d=o[n].replace(/\s+/g,"");try{i=1===s?g+d:g+d+"_"+l+"_"+String(p)}catch(e){}u[n]=o[n]}i=isNaN(parseInt(i,10))?i:i+" ","avg"===r[p].aggregator&&(l=-1===b?A.length+"_"+i:b+"_"+i,h[l]?h[l]++:h[l]=1,m=h[l]),t[i]=f[i]=function(e,r,o,t,i){var n;if(Q.jgrid.isFunction(e))n=e.call(c,r,o,t);else switch(e){case"sum":n=Q.jgrid.floatNum(r)+Q.jgrid.floatNum(t[o]);break;case"count":""!==r&&null!=r||(r=0),n=t.hasOwnProperty(o)?r+1:0;break;case"min":n=""===r||null==r?Q.jgrid.floatNum(t[o]):Math.min(Q.jgrid.floatNum(r),Q.jgrid.floatNum(t[o]));break;case"max":n=""===r||null==r?Q.jgrid.floatNum(t[o]):Math.max(Q.jgrid.floatNum(r),Q.jgrid.floatNum(t[o]));break;case"avg":n=(Q.jgrid.floatNum(r)*(i-1)+Q.jgrid.floatNum(t[o]))/i}return n}(r[p].aggregator,t[i],r[p].member,e,m)}g+=o&&null!=o[n]?o[n].replace(/\s+/g,""):"",G[i]=f,M[i]=u[n]}return t}if(q.rowTotals&&0<q.yDimension.length&&(e=q.yDimension[0].dataName,q.yDimension.splice(0,0,{dataName:e}),q.yDimension[0].converter=function(){return"_r_Totals"}),d=Array.isArray(q.xDimension)?q.xDimension.length:0,f=q.yDimension.length,p=Array.isArray(q.aggregates)?q.aggregates.length:0,0===d||0===p)throw"xDimension or aggregates optiona are not set!";for(y=0;y<d;y++)r={name:q.xDimension[y].dataName,frozen:q.frozenStaticCols},null==q.xDimension[y].isGroupField&&(q.xDimension[y].isGroupField=!0),r=Q.extend(!0,r,q.xDimension[y]),H.push(r);for(var l=d-1,s={},h=[];t<o;){for(var g=F[t],u=[],m=[],v={},y=0;u[y]=Q.jgrid.trim(g[q.xDimension[y].dataName]),v[q.xDimension[y].dataName]=u[y],++y<d;);var x,j=0,b=-1;if(x=i(A,n,u)){if(0<=b){if(j=0,1<=f){for(j=0;j<f;j++)m[j]=Q.jgrid.trim(g[q.yDimension[j].dataName]),q.yDimension[j].converter&&Q.jgrid.isFunction(q.yDimension[j].converter)&&(m[j]=q.yDimension[j].converter.call(this,m[j],u,m));x=a(g,q.aggregates,m,x)}else 0===f&&(x=a(g,q.aggregates,null,x));A[b]=x}}else{if(j=0,1<=f){for(j=0;j<f;j++)m[j]=Q.jgrid.trim(g[q.yDimension[j].dataName]),q.yDimension[j].converter&&Q.jgrid.isFunction(q.yDimension[j].converter)&&(m[j]=q.yDimension[j].converter.call(this,m[j],u,m));v=a(g,q.aggregates,m,v)}else 0===f&&(v=a(g,q.aggregates,null,v));A.push(v)}var w,D=0,N=null,O=null;for(w in G)if(G.hasOwnProperty(w)){if(0===D)N=(s=s.children&&void 0!==s.children?s:{text:w,level:0,children:[],label:w}).children;else{for(O=null,y=0;y<N.length;y++)if(N[y].text===w){O=N[y];break}N=O?O.children:(N.push({children:[],text:w,level:D,fields:G[w],label:M[w]}),N[N.length-1].children)}D++}t++}var S,h=null,T=[],C=H.length,P=C;if(0<f&&(V[f-1]={useColSpanStyle:!1,groupHeaders:[]}),!function e(r){var o,t,i,n,a;for(i in r)if(r.hasOwnProperty(i)){if("object"!=typeof r[i]){if("level"===i){if(void 0===T[r.level]&&(T[r.level]="",0<r.level&&-1===r.text.indexOf("_r_Totals")&&(V[r.level-1]={useColSpanStyle:!1,groupHeaders:[]})),T[r.level]!==r.text&&r.children.length&&-1===r.text.indexOf("_r_Totals")&&0<r.level){V[r.level-1].groupHeaders.push({titleText:r.label,numberOfColumns:0});var l=V[r.level-1].groupHeaders.length-1,s=0==l?P:C;if(r.level-1==(q.rowTotals?1:0)&&0<l){for(var g=0,u=0;u<l;u++)g+=V[r.level-1].groupHeaders[u].numberOfColumns;g&&(s=g+d)}H[s]&&(V[r.level-1].groupHeaders[l].startColumnName=H[s].name,V[r.level-1].groupHeaders[l].numberOfColumns=H.length-s),C=H.length}T[r.level]=r.text}if(r.level===f&&"level"===i&&0<f)if(1<p){var m=1;for(o in r.fields)r.fields.hasOwnProperty(o)&&(1===m&&V[f-1].groupHeaders.push({startColumnName:o,numberOfColumns:1,titleText:r.label||r.text}),m++);V[f-1].groupHeaders[V[f-1].groupHeaders.length-1].numberOfColumns=m-1}else V.splice(f-1,1)}if(null!=r[i]&&"object"==typeof r[i]&&e(r[i]),"level"===i&&0<r.level&&(r.level===(0===f?r.level:f)||-1!==T[r.level].indexOf("_r_Totals")))for(o in t=0,r.fields)if(r.fields.hasOwnProperty(o)){for(n in a={},q.aggregates[t])if(q.aggregates[t].hasOwnProperty(n))switch(n){case"member":case"label":case"aggregator":break;default:a[n]=q.aggregates[t][n]}1<p?(a.name=o,a.label=q.aggregates[t].label||r.label):(a.name=r.text,a.label="_r_Totals"===r.text?q.rowTotalsText:r.label),H.push(a),t++}}}(s),q.colTotals)for(var _=A.length;_--;)for(y=d;y<H.length;y++)S=H[y].name,k[S]?k[S]+=Q.jgrid.floatNum(A[_][S]):k[S]=Q.jgrid.floatNum(A[_][S]);if(0<l)for(y=0;y<l;y++)H[y].isGroupField&&(z.groupingView.groupField.push(H[y].name),z.groupingView.groupSummary.push(q.groupSummary),z.groupingView.groupSummaryPos.push(q.groupSummaryPos));else z.grouping=!1;z.sortname=H[l].name,z.groupingView.hideFirstGroupCol=!0}),{colModel:H,rows:A,groupOptions:z,groupHeaders:V,summary:k}},jqPivot:function(o,g,u,t){return this.each(function(){var s=this,e=u.regional||"en";function r(e){Q.jgrid.isFunction(g.onInitPivot)&&g.onInitPivot.call(s),Array.isArray(e)||(e=[]);var r,o,t,i,n=jQuery(s).jqGrid("pivotSetup",e,g),e=0<Q.assocArraySize(n.summary),a=Q.jgrid.from.call(s,n.rows);for(g.ignoreCase&&(a=a.ignoreCase()),r=0;r<n.groupOptions.groupingView.groupField.length;r++)o=g.xDimension[r].sortorder||"asc",t=g.xDimension[r].sorttype||"text",a.orderBy(n.groupOptions.groupingView.groupField[r],o,t,"",t);if(i=g.xDimension.length,u.sortname){for(o=u.sortorder||"asc",t="text",r=0;r<i;r++)if(g.xDimension[r].dataName===u.sortname){t=g.xDimension[r].sorttype||"text";break}a.orderBy(u.sortname,o,t,"",t)}else n.groupOptions.sortname&&i&&(o=g.xDimension[i-1].sortorder||"asc",t=g.xDimension[i-1].sorttype||"text",a.orderBy(n.groupOptions.sortname,o,t,"",t));jQuery(s).jqGrid(Q.extend(!0,{datastr:Q.extend(a.select(),e?{userdata:n.summary}:{}),datatype:"jsonstring",footerrow:e,userDataOnFooter:e,colModel:n.colModel,viewrecords:!0,formatFooterData:!0===g.colTotals,sortname:g.xDimension[0].dataName},n.groupOptions,u||{}));var l=n.groupHeaders;if(l.length)for(r=0;r<l.length;r++)l[r]&&l[r].groupHeaders.length&&jQuery(s).jqGrid("setGroupHeaders",l[r]);g.frozenStaticCols&&jQuery(s).jqGrid("setFrozenColumns"),Q.jgrid.isFunction(g.onCompletePivot)&&g.onCompletePivot.call(s),g.loadMsg&&Q(".loading_pivot").remove()}void 0===g.loadMsg&&(g.loadMsg=!0),g.loadMsg&&Q("<div class='loading_pivot ui-state-default ui-state-active row'>"+Q.jgrid.getRegional(s,"regional."+e+".defaults.loadtext")+"</div>").insertBefore(s).show(),"string"==typeof o?Q.ajax(Q.extend({url:o,dataType:"json",success:function(e){r(Q.jgrid.getAccessor(e,t&&t.reader?t.reader:"rows"))}},t||{})):r(o)})}})});