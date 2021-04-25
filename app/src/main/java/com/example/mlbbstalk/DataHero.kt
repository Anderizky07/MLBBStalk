package com.example.mlbbstalk

import com.example.mlbbstalk.Home.RoleHero

object DataHero {
    fun generateSupport() : ArrayList<RoleHero>{
        val support = ArrayList<RoleHero>()

        support.add(
            RoleHero("sup1",
            "Angela",
            "Support",
            "Guard/Support",
            R.drawable.angela,
            "Angela diciptakan seorang ilmuan yang bernama Dr.Baker dengan tegas percaya bahwa cinta dan harapan adalah penemuan terbesar umat manusia, maka dia memprogram kisah-kisah yang paling mengharukan di dunia ke dalam jantung ciptaan barunya."
            ))

        support.add(
            RoleHero("sup2",
                "Diggie",
                "Support",
                "Guard/Poke",
                R.drawable.diggie,
                "Hero yang berwujud burung hantu kecil lucu ini dan serta membawa sebuah tongkat jam ini menjadi senjatanya yang bisa membantu atau mesupport tim untuk meraih kemenangannya."
            ))

        support.add(
            RoleHero("sup3",
                "Estes",
                "Support",
                "Regen/Guard",
                R.drawable.estes,
                "Estes adalah hero bertipe menyerang jarak jauh dan harus di cover saat war berlangsung saat awal game karena Estes ini cara memainkannya adalah dengan memasuki late game supaya bisa memaksimalkan kekuatannya."
            ))

        support.add(
            RoleHero("sup4",
                "Kaja",
                "Fighter/Support",
                "Control/Charge",
                R.drawable.kaja,
                "Alita: Battle Angel (2019)"
            ))

        support.add(
            RoleHero("sup5",
                "Lolita",
                "Support/Tank",
                "Guard/Crowd Control",
                R.drawable.lolita,
                "Alita: Battle Angel (2019)"
            ))

        support.add(
            RoleHero("sup6",
                "Minotaur",
                "Tank/Support",
                "Crowd Control",
                R.drawable.minotaur,
                "Untuk menjadi lebih kuat dan tak terkalahkan, ia memilih untuk memasuki Minos maze dan memulai pelatihan diri dengan bantuan kekuatan Twilight Orb. Dalam cerita bahwa Minotaur adalah putra dari Bima dan Arimbi dari semesta Arcapada"
            ))

        support.add(
            RoleHero("sup7",
                "Nana",
                "Mage/Support",
                "Poke/Guard",
                R.drawable.nana,
                "Alita: Battle Angel (2019)"
            ))

        support.add(
            RoleHero("sup8",
                "Rafaela",
                "Support",
                "Regen/Guard",
                R.drawable.rafaela,
                "Alita: Battle Angel (2019)"
            ))

        return support
    }

    fun genereateMage() : ArrayList<RoleHero> {
        val mage = ArrayList<RoleHero>()

        mage.add(
            RoleHero(
                "mag1",
                "Alice",
                "Mage",
                "Charge/Regen",
                R.drawable.alice,
                "Alice adalah Hero Mobile Legends Mage yang tipe menyerangnya adalah jarak dekat, jadi hanya satu - satunya Mage yang cara bertarung atau menyerangnya adalah dengan mendekati musuh."
            ))

        mage.add(
            RoleHero(
                "mag2",
                "Cyclops",
                "Mage",
                "Poke/Control",
                R.drawable.cyclops,
                "Cyclops terobsesi dengan bintang dan langit ketika dia masih kecil. Dia menyaksikan semua hari dan malam dan menemukan kebenaran bahwa planet-planet bergerak sepanjang waktu. Dan gerakan-gerakan tersebut mengandung kekuatan sihir yang luar biasa."
            ))

        mage.add(
            RoleHero(
                "mag3",
                "Esmeralda",
                "Mage/Tank",
                "Regen/Mixed Damage",
                R.drawable.esme,
                "Alita: Battle Angel (2019)"
            ))

        mage.add(
            RoleHero(
                "mag4",
                "Eudora",
                "Mage",
                "Control/Burst",
                R.drawable.eudora,
                "Eudora berdiri di depan cermin selama sehari semalam. Pengalaman masa kecil yang mengerikan itu dan semua keraguan seputar upacara penyerahan muncul dari dirinya satu demi satu. Cahaya di matanya bersinar terang, listrik di dalam dirinya melonjak tanpa henti."
            ))

        mage.add(
            RoleHero(
                "mag5",
                "Gord",
                "Mage",
                "Poke/Burst",
                R.drawable.gord,
                "Alita: Battle Angel (2019)"
            ))

        mage.add(
            RoleHero(
                "mag6",
                "Nana",
                "Mage/Support",
                "Poke/Guard",
                R.drawable.nana,
                "Alita: Battle Angel (2019)"
            ))

        mage.add(
            RoleHero(
                "mag7",
                "Pharsa",
                "Mage",
                "Poke/Burst",
                R.drawable.pharsa,
                "Alita: Battle Angel (2019)"
            ))

        return mage

    }
    fun genereateTank() : ArrayList<RoleHero> {
        val tank = ArrayList<RoleHero>()

        tank.add(
                RoleHero(
                        "tk1",
                        "Alice",
                        "Mage/Tank",
                        "Charge/Regen",
                        R.drawable.alice,
                        "Alice adalah Hero Mobile Legends Mage yang tipe menyerangnya adalah jarak dekat, jadi hanya satu - satunya Mage yang cara bertarung atau menyerangnya adalah dengan mendekati musuh."
                ))

        tank.add(
                RoleHero("tk2",
                        "Minotaur",
                        "Tank/Support",
                        "Crowd Control",
                        R.drawable.minotaur,
                        "Untuk menjadi lebih kuat dan tak terkalahkan, ia memilih untuk memasuki Minos maze dan memulai pelatihan diri dengan bantuan kekuatan Twilight Orb. Dalam cerita bahwa Minotaur adalah putra dari Bima dan Arimbi dari semesta Arcapada"
                ))

        tank.add(
                RoleHero("tk3",
                        "Esmeralda",
                        "Mage/Tank",
                        "Regen/Mixed Damage",
                        R.drawable.esme,
                        "Alita: Battle Angel (2019)"
                ))

        return tank
    }
}