/**
 * 
 */
package atomic.tokenizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import atomic.AGraph;
import atomic.AToken;
import atomic.AtomicFactory;

/**
 * @author kurs22
 *
 */
public class AtomicTokenizer {
	
	/**
	 * @param corpusTextFile
	 * @param model
	 */
	static public void tokenizeAndAddTokensToGraph(final File corpusTextFile,
			AGraph model) {
		EList<AToken> tokens = model.getTokens();
		if (tokens.isEmpty()) {
			int index = 0;
			try {
				String corpus = new Scanner(new InputStreamReader(new FileInputStream(corpusTextFile), "UTF-8"))
				.useDelimiter("\\A").next();
				for (String text : corpus.split(" ")) {
					AToken token = AtomicFactory.eINSTANCE.createAToken();
					token.setText(text + index);
					if (!tokens.isEmpty())
						token.setPrevious(tokens.get(tokens.size() - 1));
					if (!tokens.contains(token))
						tokens.add(token);
					index++;
				}
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
