package com.example.examplestatemachine;

        public class StateContext {


    private State acceptState;
    private State rejectState;
	private State state;
	private String str;
	private Actions initialAction;

        	public  StateContext() {
        		this.acceptState = new AcceptState(this);
        		this.rejectState = new RejectState(this);
        		state = rejectState;
        		this.initialAction = new Actions();
				setStr(initialAction.getNoAction());
        	}

        	public void actionA() {
        		state.actionA();
        	}

        	public void actionB() {
        		state.actionB();
        	}

        	public void setState(State state) {
        		this.state = state;
        	}

        	public void setAcceptState(State state) {
        		this.state = state;
        	}

        	public void setRejectState(State state) {
        		this.state = state;
        	}

        	public State getRejectState() {
        		return rejectState;
        	}

        	public State getAcceptState() {
        		return acceptState;
        	}

        	public State getState() {
        		return state;
        	}

        	public boolean isAccept() {
                return state.accept;
            }

			public String getStr() {
				return str;
			}

			public void setStr(String str) {
				this.str = str;
			}
		}