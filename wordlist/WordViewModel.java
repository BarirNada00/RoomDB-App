package ma.projet.android.wordlist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordsRepository mRepository;

    private LiveData<List<Words>> mAllWords;

    public WordViewModel(@NonNull Application application) {

        super(application);
        mRepository = new WordsRepository(application);
        mAllWords = mRepository.getAllWords();
    }


    public void insert(Words word) {
        mRepository.insert(word);
    }

    public void delete(Words word) {
        mRepository.delete(word);
    }

    public void update(Words word) {
        mRepository.update(word);
    }

    public void deleteAllWords() {
        mRepository.deleteAllWords();
    }



    public LiveData<List<Words>> getAllWords() {
        return mAllWords;
    }
}
