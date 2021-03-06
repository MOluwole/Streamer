package com.example.yung.streamer

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.exoplayer.ExoPlayer
import com.halilibo.bettervideoplayer.BetterVideoPlayer


class OfflinePlay : AppCompatActivity() {

    val BUFFER_SEGMENT_SIZE: Int = 64 * 1024
    val BUFFER_SEGMENT_COUNT: Int = 256

    var exoPlayer: ExoPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offline_play)

        val video_uri: Uri = Uri.parse(intent.getStringExtra("File"))

        val video_player = findViewById(R.id.player) as BetterVideoPlayer
        video_player.enableControls()
        video_player.enableSwipeGestures()
        video_player.setSource(video_uri)
        video_player.start()
//        val surfaceView = findViewById(R.id.surface_view) as SurfaceView
//
//        val allocator = DefaultAllocator(BUFFER_SEGMENT_SIZE)
//        val dataSource = DefaultUriDataSource(this, "userAgent")
//        // val S = ExtractorSampleSource()
//        val sampleSource = ExtractorSampleSource(video_uri, dataSource, allocator, BUFFER_SEGMENT_COUNT * BUFFER_SEGMENT_SIZE)
//        val videoRenderer = MediaCodecVideoTrackRenderer(
//                this, sampleSource, MediaCodecSelector.DEFAULT, MediaCodec.VIDEO_SCALING_MODE_SCALE_TO_FIT)
//        val audioRenderer = MediaCodecAudioTrackRenderer(
//                sampleSource, MediaCodecSelector.DEFAULT)
//        val rendererArray = arrayOf<TrackRenderer>(videoRenderer, audioRenderer)
//
//        exoPlayer = ExoPlayer.Factory.newInstance(rendererArray.size)
//        exoPlayer?.prepare(*rendererArray)
//        exoPlayer?.sendMessage(videoRenderer, MediaCodecVideoTrackRenderer.MSG_SET_SURFACE, surfaceView.holder.surface)
//        exoPlayer?.playWhenReady = true
    }

    override fun onBackPressed() {
//        exoPlayer?.stop()
        finish()
    }
}
