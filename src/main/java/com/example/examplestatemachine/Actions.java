package com.example.examplestatemachine;

        public class Actions {

    private String actionA = "actionA";
	private String actionB = "actionB";
	private String noAction = "noAction";

        	public String getNoAction() {
        		return noAction;
        	}

			public String getActionA() {
				return actionA;
			}

			public void setActionA(String actionA) {
				this.actionA = actionA;
			}

			public String getActionB() {
				return actionB;
			}

			public void setActionB(String actionB) {
				this.actionB = actionB;
			}

			public void setNoAction(String noAction) {
				this.noAction = noAction;
			}
		}