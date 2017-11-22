package root.onesms.Manager

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import root.onesms.R

/**
 * Created by root1 on 2017. 10. 26..
 */
class SoundManager(context: Context) {
    lateinit var mediaPlayer : MediaPlayer;

    init {
        val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.isSpeakerphoneOn = true
        audioManager.ringerMode = AudioManager.RINGER_MODE_NORMAL
        mediaPlayer = MediaPlayer.create(context, R.raw.siren)
        mediaPlayer.start()
    }

    public fun stopSound(){
        mediaPlayer.stop()
    }

}