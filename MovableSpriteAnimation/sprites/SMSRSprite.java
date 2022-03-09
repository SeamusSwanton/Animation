import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SMSRSprite implements DisplayableSprite, MovableSprite {
	
	private double centerX = 0;
	private double centerY = 0;
	private double width = 50;
	private double height = 50;
	private boolean dispose = false;	
	private double velocityX = 0;
	private double velocityY = 0;
	
	SMSRSprite(double centerX, double centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}

	@Override
	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}

	@Override
	public void setCenterY(double centerY) {
		this.centerY = centerY;

	}

	@Override
	public void setVelocityX(double pixelsPerSecond) {
		this.velocityX = pixelsPerSecond;
		}

	@Override
	public void setVelocityY(double pixelsPerSecond) {
		velocityY = pixelsPerSecond;
		}

	
	
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getMinX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaxX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMinY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaxY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCenterX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCenterY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getDispose() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public void setDispose(boolean dispose) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Universe universe, KeyboardInput keyboard, long actual_delta_time) {
		// TODO Auto-generated method stub
		
	}
}
