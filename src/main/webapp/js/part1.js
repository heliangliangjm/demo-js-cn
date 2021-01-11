/*
一个完整的JavaScript实现应该由下列三个不同的部分组成：
	1.核心(ECMAScript)
	2.文档对象模型(DOM)
	3.浏览器对象模型(BOM)

<script>元素
	包含在<script>元素内部的JavaScript代码将被从上至下依次解释。
	在解释器对<script>元素内部的所有代码求值完毕以前，页面中的其余内容都不会被浏览器加载或显示。
	按照解析嵌入式代码的规则，当浏览器遇到字符串"</script>"时，就会认为那是结束的</script>标签。而通过转义字符“/” 可以解决这个问题，
	
	如果要通过<script>元素来包含外部JavaScript文件，那么src属性就是必需的。这个属性的值是一个指向外部JavaScript文件的链接，
	外部文件只须包含通常要放在开始的<script>和结束的</script>之间的那些JavaScript代码即可。
	与解析嵌人式JavaScript代码一样，在解析外部JavaScript文件(包括下载该文件)时，页面的处理也会暂时停止。
	如果是在XHTML文档中，也可以省略前面示例代码中结束的</script>标签，
	但是，不能在HTML文档使用这种语法。原因是这种语法不符合HTML规范，而且也得不到某些浏览器(尤其是IE)的正确解析。




 */
function sayScript(){
	alert('</script>');
}
sayScript();