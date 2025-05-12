public class HttpRequest {
    private String url;
    private String method;
    private String body;
    private String contentType;
    private String accept;
    private String authorization;
    private String cookie;
    private String userAgent;
    private String referer;
    private String acceptEncoding;
    private String acceptLanguage;
    private String connection;
    private String host;
    private String pragma;
    private String cacheControl;
    private int contentLength;
    private String contentMD5;
    private String contentRange;
    private String date;
    private String expect;
    private String forwarded;
    private String from;
    private String ifMatch;
    private String ifModifiedSince;
    private String ifNoneMatch;
    private String ifRange;
    private String ifUnmodifiedSince;
    private String maxForwards;
    private String origin;
    private String range;
    private String te;
    private String upgrade;
    private String user;
    private String xRequestedWith;

    public HttpRequest(String url, String method) {
        this.url = url;
        this.method = method;
    }

    public String getUrl() {
        return url;
    }
    public String getMethod() {
        return method;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public String getAccept() {
        return accept;
    }
    public void setAccept(String accept) {
        this.accept = accept;
    }
    public String getAuthorization() {
        return authorization;
    }
}
