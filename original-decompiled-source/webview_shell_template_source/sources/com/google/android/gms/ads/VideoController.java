package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzfz;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzeb zzb;
    private VideoLifecycleCallbacks zzc;

    public int getPlaybackState() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return 0;
            }
            try {
                return zzebVar.zzh();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call getPlaybackState on video controller.", e6);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z6;
        synchronized (this.zza) {
            z6 = this.zzb != null;
        }
        return z6;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzo();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call isClickToExpandEnabled.", e6);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzp();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call isUsingCustomPlayerControls.", e6);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return true;
            }
            try {
                return zzebVar.zzq();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call isMuted on video controller.", e6);
                return true;
            }
        }
    }

    public void mute(boolean z6) {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzj(z6);
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call mute on video controller.", e6);
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzk();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call pause on video controller.", e6);
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzl();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call play on video controller.", e6);
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfz zzfzVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfzVar = null;
            } else {
                try {
                    zzfzVar = new zzfz(videoLifecycleCallbacks);
                } catch (RemoteException e6) {
                    zzo.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e6);
                }
            }
            zzebVar.zzm(zzfzVar);
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzn();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call stop on video controller.", e6);
            }
        }
    }

    public final zzeb zza() {
        zzeb zzebVar;
        synchronized (this.zza) {
            zzebVar = this.zzb;
        }
        return zzebVar;
    }

    public final void zzb(zzeb zzebVar) {
        synchronized (this.zza) {
            try {
                this.zzb = zzebVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }

        public void onVideoMute(boolean z6) {
        }
    }
}
