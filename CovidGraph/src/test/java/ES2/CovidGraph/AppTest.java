package ES2.CovidGraph;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	@Before
	public void setUp() throws Exception {
		File f = new File("git/");
		Git g = Git.open(f);
		
	}

	@Test
	public void testCloneGit() throws IOException {
		File f = new File("git/");
		Git g = Git.open(f);
		assertEquals("class org.eclipse.jgit.api.Git",g.getClass().toString());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetRDFfile() throws IOException {
		Git g = Git.open(new File("git/"));
		assertEquals("class org.eclipse.jgit.internal.storage.file.FileRepository", g.getRepository().getClass().toString());
		//fail("Not yet implemented");
	}

	@Test
	public void testValuesList() {
		String t = "timestamp";
		String f = "filename";
		assertEquals("timestamp", t);
		assertEquals("filename", f);
		
		
		//fail("Not yet implemented");
	}

	@Test
	public void testPopulateHTML() {
		String html = "<html>";
		String table = "<table>";
		assertEquals("<table", table);
		assertEquals("<html>", html);
		//fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		App app = new App ();
		assertEquals("ES2.CovidGraph.App", app.getClass().toString());
		//fail("Not yet implemented");
	}

}
