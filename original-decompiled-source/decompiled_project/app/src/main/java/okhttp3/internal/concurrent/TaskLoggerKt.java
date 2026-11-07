package okhttp3.internal.concurrent;

import com.android.apksig.internal.apk.a;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TaskLoggerKt {
    public static final void a(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.f19420h.getClass();
        TaskRunner.f19422j.fine(taskQueue.f19413b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f19408a);
    }

    public static final String b(long j10) {
        String strA;
        if (j10 <= -999500000) {
            strA = a.a((j10 - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j10 <= -999500) {
            strA = a.a((j10 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j10 <= 0) {
            strA = a.a((j10 - CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) / DescriptorProtos.Edition.EDITION_2023_VALUE, " µs", new StringBuilder());
        } else if (j10 < 999500) {
            strA = a.a((j10 + CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) / DescriptorProtos.Edition.EDITION_2023_VALUE, " µs", new StringBuilder());
        } else if (j10 < 999500000) {
            strA = a.a((j10 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strA = a.a((j10 + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strA}, 1));
    }
}
