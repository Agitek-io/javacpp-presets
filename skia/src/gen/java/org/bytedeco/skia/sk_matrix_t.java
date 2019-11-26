// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;


/**
    The sk_matrix_t struct holds a 3x3 perspective matrix for
    transforming coordinates:
        <p>
        (X,Y) = T[M]((x,y))
        X = (M[0] * x + M[1] * y + M[2]) / (M[6] * x + M[7] * y + M[8]);
        Y = (M[3] * x + M[4] * y + M[5]) / (M[6] * x + M[7] * y + M[8]);
    <p>
    Therefore, the identity matrix is
        <p>
        sk_matrix_t identity = {{1, 0, 0,
                                 0, 1, 0,
                                 0, 0, 1}};
    <p>
    A matrix that scales by sx and sy is:
        <p>
        sk_matrix_t scale = {{sx, 0,  0,
                              0,  sy, 0,
                              0,  0,  1}};
    <p>
    A matrix that translates by tx and ty is:
        <p>
        sk_matrix_t translate = {{1, 0, tx,
                                  0, 1, ty,
                                  0, 0, 1}};
    <p>
    A matrix that rotates around the origin by A radians:
        <p>
        sk_matrix_t rotate = {{cos(A), -sin(A), 0,
                               sin(A),  cos(A), 0,
                               0,       0,      1}};
    <p>
    Two matrixes can be concatinated by:
         <p>
         void concat_matrices(sk_matrix_t* dst,
                             const sk_matrix_t* matrixU,
                             const sk_matrix_t* matrixV) {
            const float* u = matrixU->mat;
            const float* v = matrixV->mat;
            sk_matrix_t result = {{
                    u[0] * v[0] + u[1] * v[3] + u[2] * v[6],
                    u[0] * v[1] + u[1] * v[4] + u[2] * v[7],
                    u[0] * v[2] + u[1] * v[5] + u[2] * v[8],
                    u[3] * v[0] + u[4] * v[3] + u[5] * v[6],
                    u[3] * v[1] + u[4] * v[4] + u[5] * v[7],
                    u[3] * v[2] + u[4] * v[5] + u[5] * v[8],
                    u[6] * v[0] + u[7] * v[3] + u[8] * v[6],
                    u[6] * v[1] + u[7] * v[4] + u[8] * v[7],
                    u[6] * v[2] + u[7] * v[5] + u[8] * v[8]
            }};
            *dst = result;
        }
*/
@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_matrix_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_matrix_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_matrix_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_matrix_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_matrix_t position(long position) {
        return (sk_matrix_t)super.position(position);
    }

    public native float scaleX(); public native sk_matrix_t scaleX(float setter);
    public native float skewX(); public native sk_matrix_t skewX(float setter);
    public native float transX(); public native sk_matrix_t transX(float setter);
    public native float skewY(); public native sk_matrix_t skewY(float setter);
    public native float scaleY(); public native sk_matrix_t scaleY(float setter);
    public native float transY(); public native sk_matrix_t transY(float setter);
    public native float persp0(); public native sk_matrix_t persp0(float setter);
    public native float persp1(); public native sk_matrix_t persp1(float setter);
    public native float persp2(); public native sk_matrix_t persp2(float setter);
}
