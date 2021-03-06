package lms;

import java.util.Calendar;


/**
 * A movie in the collection.
 * @author Jill Seaman
 *
 */
public class Movie extends Resource {
	
	private String upc;      // the universal product code for the movie

	/**
	 * constructs Movie from parameters
	 * @param resourceID
	 * @param title
	 * @param upc
	 */
	public Movie(int resourceID, String title, String upc) {
		super(resourceID, title);
		this.upc = upc;
	}

	@Override
	public Calendar calculateNewDueDate(Calendar startDate, Member member) {
		
        Calendar newDate = (Calendar)startDate.clone();
		newDate.add(Calendar.DATE, 7);  //Movies are checked out for 7 days
        return newDate;
	
	}
}
