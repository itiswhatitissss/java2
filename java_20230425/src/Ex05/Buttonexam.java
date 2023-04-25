package Ex05;

public class Buttonexam {

	public static void main(String[] args) {
		
		Button btnok= new Button();
		
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("ok버튼을 클릭했습니다");
			}
		}
		btnok.setClickListener(new OkListener());
		btnok.click();
		
		/////////////////////////////////////////////////////////////////
		Button btnCancel = new Button();
		class CancelListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다");
			}
		}
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
		
		Button dbtn = new Button();
		class doubleclick implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("더블클릭을 했습니다");
			}
		}
		dbtn.setClickListener(new doubleclick());
		dbtn.click();
	}

}
