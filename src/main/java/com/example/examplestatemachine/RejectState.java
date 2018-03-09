package com.example.examplestatemachine;

        public class RejectState extends State{

        	StateContext sc;

        	public RejectState(StateContext sc) {
        		this.sc = sc;
        		this.accept = false;
        	}

        	@Override
	public void actionA() {
				switch (sc.getStr()) {
					case "noAction":
						sc.setStr("actionA");
						sc.setState(sc.getAcceptState());
						break;
					case "actionA":
						sc.setState(sc.getAcceptState());
						break;
					case "actionB":
						sc.setState(sc.getRejectState());
						break;
				}
        	}

        	@Override
	public void actionB() {
				switch (sc.getStr()) {
					case "noAction":
						sc.setStr("actionB");
						sc.setState(sc.getAcceptState());
						break;
					case "actionB":
						sc.setState(sc.getAcceptState());
						break;
					case "actionA":
						sc.setState(sc.getRejectState());
						break;
				}
        	}

        }

