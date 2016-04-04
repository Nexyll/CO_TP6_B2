package iut;

/**
 * Bouton cliquable.
 */
public class Bouton extends Label {        
    public Bouton(Composant parent, int x, int y, int w, int h)
    {
        super(parent, x,y,w,h);        
    }
        
    @Override
    /**
     * Dessine le bouton : rectangle arrondi gris à contour noir, texte
     * @author
     */
    public void dessiner(Ecran e) {
	e.traceRectangle(this.getX(), this.getY(), this.getLargeur(), this.getHauteur(), 0xAA);
        e.traceTexte(getX(), getY(), this.getTexte(), this.getPolice());
    }

    @Override
	protected String nomType() {
		return "bouton";
	}

	/**
	 * @return true si le composant peut recevoir des enfants
	 */
    @Override
	protected boolean peutAvoirComposants() {
		return false;
	}
    
}