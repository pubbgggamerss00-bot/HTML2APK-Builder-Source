package f1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f12974a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f12975a;

        /* renamed from: b, reason: collision with root package name */
        public final d f12976b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12977c = true;

        public a(TextView textView) {
            this.f12975a = textView;
            this.f12976b = new d(textView);
        }

        @Override // f1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f12977c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i6 = 0; i6 < inputFilterArr.length; i6++) {
                    InputFilter inputFilter = inputFilterArr[i6];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i6, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i7 = 0;
                for (int i8 = 0; i8 < length; i8++) {
                    if (sparseArray.indexOfKey(i8) < 0) {
                        inputFilterArr2[i7] = inputFilterArr[i8];
                        i7++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i9 = 0;
            while (true) {
                d dVar = this.f12976b;
                if (i9 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i9] == dVar) {
                    return inputFilterArr;
                }
                i9++;
            }
        }

        @Override // f1.f.b
        public final void b(boolean z6) {
            if (z6) {
                d();
            }
        }

        @Override // f1.f.b
        public final void c(boolean z6) {
            this.f12977c = z6;
            d();
            TextView textView = this.f12975a;
            textView.setFilters(a(textView.getFilters()));
        }

        public final void d() {
            TextView textView = this.f12975a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f12977c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).s;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z6) {
            throw null;
        }

        public void c(boolean z6) {
            throw null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f12978a;

        public c(TextView textView) {
            this.f12978a = new a(textView);
        }

        @Override // f1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !(androidx.emoji2.text.g.f991k != null) ? inputFilterArr : this.f12978a.a(inputFilterArr);
        }

        @Override // f1.f.b
        public final void b(boolean z6) {
            if (androidx.emoji2.text.g.f991k != null) {
                this.f12978a.b(z6);
            }
        }

        @Override // f1.f.b
        public final void c(boolean z6) {
            a aVar = this.f12978a;
            if (androidx.emoji2.text.g.f991k != null) {
                aVar.c(z6);
            } else {
                aVar.f12977c = z6;
            }
        }
    }

    public f(TextView textView) {
        this.f12974a = new c(textView);
    }
}
