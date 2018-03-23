package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

public static void main(String[] args) {
	Robot a = new Robot();
	Robot b = new Robot();
	Robot c = new Robot();
	Robot d = new Robot();
	Robot e = new Robot();
	Thread aa = new Thread(()->{a.moveTo(200,300);
	a.setPenColor(Color.BLUE);
	a.penDown();
	a.setSpeed(10);
	a.setPenWidth(10);
	for (int i = 0; i < 360; i++) {
		a.move(4);
		a.turn(1);
	}
	});
	Thread bb = new Thread(()->{b.moveTo(600,300);
	b.setPenColor(Color.black);
	b.penDown();
	b.setSpeed(10);
	b.setPenWidth(10);
	for (int i = 0; i < 360; i++) {
		b.move(4);
		b.turn(1);
	}
	});
	Thread cc = new Thread(()->{c.moveTo(1000,300);
	c.setPenColor(Color.red);
	c.penDown();
	c.setSpeed(10);
	c.setPenWidth(10);
	for (int i = 0; i < 360; i++) {
		c.move(4);
		c.turn(1);
	}
	});
	Thread dd = new Thread(()->{d.moveTo(400,600);
	d.setPenColor(Color.yellow);
	d.penDown();
	d.setSpeed(10);
	d.setPenWidth(10);
	for (int i = 0; i < 360; i++) {
		d.move(4);
		d.turn(1);
	}
	});
	Thread ee = new Thread(()->{e.moveTo(800,600);
	e.setPenColor(Color.GREEN);
	e.penDown();
	e.setSpeed(10);
	e.setPenWidth(10);
	for (int i = 0; i < 360; i++) {
		e.move(4);
		e.turn(1);
	}
	});
aa.start();
bb.start();
cc.start();
dd.start();
ee.start();
	
	
	
}
}

