package com.xyz;

public class TextEditor 
{
    private SpellChecker spellChecker;
    
    public TextEditor(SpellChecker spellChecker)
    {
    	System.out.println("Inside the textEditor");
    	this.spellChecker=spellChecker;
    }
    public void spellCheck()
    {
    	spellChecker.checkSpelling();
    }
}
