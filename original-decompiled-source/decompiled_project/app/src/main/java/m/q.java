package m;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f17169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f17170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17171c;

    public q(TextView textView, Typeface typeface, int i10) {
        this.f17169a = textView;
        this.f17170b = typeface;
        this.f17171c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17169a.setTypeface(this.f17170b, this.f17171c);
    }
}
