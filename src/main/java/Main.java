
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cooksys.ftd.chat.server.Server;

public class Main {

	static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Server mv = new Server(667);
		Thread serverThread = new Thread(mv);
		serverThread.start();

		try {
			serverThread.join();
			System.exit(0);
		} catch (InterruptedException e) {
			log.error("Server thread interrupted :(", e);
			System.exit(-1);
		}
	}

}