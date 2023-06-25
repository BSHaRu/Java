package templateMethodPattern;

import templateMethodPattern.ex.Controller;

public class FirstController extends Controller {

	@Override
	protected void run() {
		System.out.println("FirstController 실행");
	}

	/*
	@Override
	protected void init() {
		System.out.println("내맘대로 init");
	}
	*/
	

}
