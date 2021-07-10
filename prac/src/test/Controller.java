package test;

class HttpRequest{
	//Request => 사용자의 요청을 받음
}

class HttpResponse{
	//Response => 요청을 처리 후에 응답
}

public interface Controller {
	public String handlerRequest(HttpRequest req, HttpResponse res);//객체 전
}
