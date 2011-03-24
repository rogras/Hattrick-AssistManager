public String DOM2String(Document doc)
{
    TransformerFactory transformerFactory =TransformerFactory.newInstance();
    Transformer transformer = null;
    try{
        transformer = transformerFactory.newTransformer();
    }catch (javax.xml.transform.TransformerConfigurationException error){
        coderror=123;
        msgerror=error.getMessage();
        return null;
    }

    Source source = new DOMSource(doc);

    StringWriter writer = new StringWriter();
    Result result = new StreamResult(writer);
    try{
        transformer.transform(source,result);
    }catch (javax.xml.transform.TransformerException error){
        coderror=123;
        msgerror=error.getMessage();
        return null;
    }

    String s = writer.toString();
    return s;
}

public Document string2DOM(String s)
{
    Document tmpX=null;
    DocumentBuilder builder = null;
    try{
        builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }catch(javax.xml.parsers.ParserConfigurationException error){
        coderror=10;
        msgerror="Error crando factory String2DOM "+error.getMessage();
        return null;
    }
    try{
        tmpX=builder.parse(new ByteArrayInputStream(s.getBytes()));
    }catch(org.xml.sax.SAXException error){
        coderror=10;
        msgerror="Error parseo SAX String2DOM "+error.getMessage();
        return null;
    }catch(IOException error){
        coderror=10;
        msgerror="Error generando Bytes String2DOM "+error.getMessage();
        return null;
    }
    return tmpX;
}
