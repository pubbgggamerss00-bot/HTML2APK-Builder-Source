package l;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import u0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        c.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new c.a(clipData, 3);
            } else {
                c.C0094c c0094c = new c.C0094c();
                c0094c.f14457a = clipData;
                c0094c.f14458b = 3;
                aVar = c0094c;
            }
            u0.f0.i(textView, aVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new c.a(clipData, 3);
        } else {
            c.C0094c c0094c = new c.C0094c();
            c0094c.f14457a = clipData;
            c0094c.f14458b = 3;
            aVar = c0094c;
        }
        u0.f0.i(view, aVar.build());
        return true;
    }
}
