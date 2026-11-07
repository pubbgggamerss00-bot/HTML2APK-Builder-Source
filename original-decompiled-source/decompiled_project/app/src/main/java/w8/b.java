package w8;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import com.basitce.htmltoapk.R;
import eh.l;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        Context ctx = (Context) obj;
        r.e(ctx, "ctx");
        final VideoView videoView = new VideoView(ctx);
        videoView.setVideoURI(Uri.parse("android.resource://" + ctx.getPackageName() + "/" + R.raw.sample_video));
        MediaController mediaController = new MediaController(ctx);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: w8.c
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                videoView.start();
            }
        });
        return videoView;
    }
}
