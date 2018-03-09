package com.example.examplestatemachine;

        public class AcceptState extends State{

        	StateContext sc;

        	public AcceptState(StateContext sc) {
        		this.sc = sc;
        		this.accept = true;
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