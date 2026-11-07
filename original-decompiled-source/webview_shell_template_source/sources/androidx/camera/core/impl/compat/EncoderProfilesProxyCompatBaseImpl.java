package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class EncoderProfilesProxyCompatBaseImpl {
    private EncoderProfilesProxyCompatBaseImpl() {
    }

    public static EncoderProfilesProxy from(CamcorderProfile camcorderProfile) {
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(camcorderProfile.duration, camcorderProfile.fileFormat, toAudioProfiles(camcorderProfile), toVideoProfiles(camcorderProfile));
    }

    private static List<EncoderProfilesProxy.AudioProfileProxy> toAudioProfiles(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i6 = camcorderProfile.audioCodec;
        arrayList.add(EncoderProfilesProxy.AudioProfileProxy.create(i6, EncoderProfilesProxy.getAudioCodecMimeType(i6), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static List<EncoderProfilesProxy.VideoProfileProxy> toVideoProfiles(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i6 = camcorderProfile.videoCodec;
        arrayList.add(EncoderProfilesProxy.VideoProfileProxy.create(i6, EncoderProfilesProxy.getVideoCodecMimeType(i6), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
