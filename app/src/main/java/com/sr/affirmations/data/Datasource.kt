package com.sr.affirmations.data

import com.sr.affirmations.R
import com.sr.affirmations.model.Affermation

class Datasource {

    fun loadAffermations(): List<Affermation> {
        return listOf<Affermation>(Affermation(R.string.affirmation1),
                                    Affermation(R.string.affirmation2),
                                    Affermation(R.string.affirmation3),
            Affermation(R.string.affirmation4),
            Affermation(R.string.affirmation5),
            Affermation(R.string.affirmation6),
            Affermation(R.string.affirmation7),
            Affermation(R.string.affirmation8),
            Affermation(R.string.affirmation9),
            Affermation(R.string.affirmation10),

            )

    }
}