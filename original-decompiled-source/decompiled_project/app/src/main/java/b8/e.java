package b8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (j7.h.b(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Drawable drawable, Bitmap.Config config, x7.h hVar, x7.f fVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || b.a(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z10) {
                    long jA = j7.h.a(bitmap.getWidth(), bitmap.getHeight(), hVar, fVar, x7.h.f32198c);
                }
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iB = t.b(drawableMutate);
        if (iB <= 0) {
            iB = 512;
        }
        int iA = t.a(drawableMutate);
        int i10 = iA > 0 ? iA : 512;
        long jA2 = j7.h.a(iB, i10, hVar, fVar, x7.h.f32198c);
        double dB = j7.h.b(iB, i10, (int) (jA2 >> 32), (int) (BodyPartID.bodyIdMax & jA2), fVar);
        int iA2 = gh.a.a(iB * dB);
        int iA3 = gh.a.a(dB * i10);
        if (config == null || b.a(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA2, iA3, config);
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iA2, iA3);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }
}
