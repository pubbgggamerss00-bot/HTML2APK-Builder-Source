package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import y3.c;
import y3.q0;

/* loaded from: classes.dex */
public final class n {
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
                c.C0341c c0341c = new c.C0341c();
                c0341c.f33794a = clipData;
                c0341c.f33795b = 3;
                aVar = c0341c;
            }
            q0.d(textView, aVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new c.a(clipData, 3);
        } else {
            c.C0341c c0341c = new c.C0341c();
            c0341c.f33794a = clipData;
            c0341c.f33795b = 3;
            aVar = c0341c;
        }
        q0.d(view, aVar.build());
        return true;
    }
}
