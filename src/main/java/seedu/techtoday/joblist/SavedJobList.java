package seedu.techtoday.joblist;

import java.util.ArrayList;

import seedu.techtoday.articlelist.ArticleTitleSorter;
import seedu.techtoday.objects.Job;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class SavedJobList {

    public static ArrayList<Job> savedJobList;

    /** Initializes a new taskList.  */
    public SavedJobList() {
        savedJobList = new ArrayList<Job>();
    }

    /**
     * Function that sorts Job objects by title.
     */
    public static void sort() {
        savedJobList.sort(new JobTitleSorter());
    }
}