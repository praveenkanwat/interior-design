#include <stdlib.h>

#include <GL/glut.h>


#include "imageloader.h"

#include<iostream>
#include<fstream>
using namespace std;
float chairx=0,chairy=0,chairz=0,sofax=7.5,sofay=0,sofaz=5,bedx=-7.5,bedy=0,bedz=5;
class object{
    public:
string slash;
string type;
float x[5000],y[5000],z[5000];
float a[5000],b[5000],c[5000];
float m[5000],n[5000];
int f[9][5000];
int i=0,j=0,l=0,k=0;
object(int p){
ifstream file;
if(p==0){file.open("sofa.txt");}
if(p==1){file.open("armchair.txt");}
if(p==2){file.open("bunkbed.txt");}
if(p==3){file.open("bunkbed.txt");}
if(file.is_open()){
    while(file>>type){
        if(type=="v"){
file>>x[i]>>y[i]>>z[i];
    //cout<<type<<" "<<x[i]<<" "<<y[i]<<" "<<z[i]<<endl;
    i++;
    }
else if(type=="vn"){
    file>>a[j]>>b[j]>>c[j];
    // cout<<type<<" "<<a[j]<<" "<<b[j]<<" "<<c[j]<<endl;
j++;
}
else if(type=="vt"){
    file>>m[l]>>n[l];
    // cout<<type<<" "<<m[l]<<" "<<n[l]<<endl;
l++;
}
else if(type=="f"){
    file>>f[0][k]>>slash[0]>>f[1][k]>>slash[2]>>f[3][k]
    >>f[3][k]>>slash[0]>>f[4][k]>>slash[1]>>f[5][k]
    >>f[6][k]>>slash[0]>>f[7][k]>>slash[1]>>f[8][k];
   // cout<<type<<" "<<f[0][k]<<"/"<<f[1][k]<<"/"<<f[2][k]
   // <<" "<<f[3][k]<<"/"<<f[4][k]<<"/"<<f[5][k]
   // <<" "<<f[6][k]<<"/"<<f[7][k]<<"/"<<f[8][k]<<endl;
    k++;
}

    }
file.close();
}}

};
object c1(0);
object c2(1);
object c3(2);
using namespace std;
const float BOX_SIZE = 7.0; //The length of each side of the cube
float _angle = 0;            //The rotation of the box
GLuint sofatextureId,chairtextureId,bedtextureId;           //The OpenGL id of the texture

void handleKeypress(unsigned char key, int x, int y) {
	switch (key) {
		case 27: //Escape key
			exit(0);

	}
}

//Makes the image into a texture, and returns the id of the texture
GLuint loadTexture(Image* image) {
	GLuint textureId;
	glGenTextures(1, &textureId);
	glBindTexture(GL_TEXTURE_2D, textureId);
	glTexImage2D(GL_TEXTURE_2D,
				 0,
				 GL_RGB,
				 image->width, image->height,
				 0,
				 GL_RGB,
				 GL_UNSIGNED_BYTE,
				 image->pixels);
	return textureId;
}

void initRendering() {
	glEnable(GL_DEPTH_TEST);
	//glEnable(GL_LIGHTING);
	glEnable(GL_LIGHT0);
	glEnable(GL_NORMALIZE);
	glEnable(GL_COLOR_MATERIAL);

	Image* sofa = loadBMP("sofa.bmp");
	sofatextureId = loadTexture(sofa);
	delete sofa;
	Image* chair = loadBMP("armchair.bmp");
	chairtextureId = loadTexture(chair);
	delete chair;
	Image* bed = loadBMP("bunkbed.bmp");
	bedtextureId = loadTexture(bed);
	delete bed;
}

void handleResize(int w, int h) {
	glViewport(0, 0, w, h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluPerspective(45.0, (float)w / (float)h, 1.0, 20000.0);
}

void drawScene() {
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();

	glTranslatef(0.0f, -8.0f, -20.0f);

	GLfloat ambientLight[] = {0.3f, 0.3f, 0.3f, 1.0f};
	glLightModelfv(GL_LIGHT_MODEL_AMBIENT, ambientLight);

	GLfloat lightColor[] = {0.7f, 0.7f, 0.7f, 1.0f};
	GLfloat lightPos[] = {-2 * BOX_SIZE, BOX_SIZE, 4 * BOX_SIZE, 1.0f};
	glLightfv(GL_LIGHT0, GL_DIFFUSE, lightColor);
	glLightfv(GL_LIGHT0, GL_POSITION, lightPos);
glRotatef(30, 1.0f, 0.0f, 0.0f);
	glRotatef(-_angle, 0.0f, 1.0f, 0.0f);

	glEnable(GL_TEXTURE_2D);
	glBindTexture(GL_TEXTURE_2D,sofatextureId);
	glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
	glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
	glColor3f(1.0f, 1.0f, 1.0f);
	glBegin(GL_TRIANGLES);

for (int i=0;i<c1.k;i++){
glNormal3f(c1.a[c1.f[2][i]-1],c1.b[c1.f[2][i]-1],c1.c[c1.f[2][i]-1]);
glTexCoord2f(c1.m[c1.f[1][i]-1],c1.n[c1.f[1][i]-1]);
glVertex3f(c1.x[c1.f[0][i]-1]+sofax,c1.y[c1.f[0][i]-1]+sofay,c1.z[c1.f[0][i]-1]+sofaz);
glNormal3f(c1.a[c1.f[5][i]-1],c1.b[c1.f[5][i]-1],c1.c[c1.f[5][i]-1]);
glTexCoord2f(c1.m[c1.f[4][i]-1],c1.n[c1.f[4][i]-1]);
glVertex3f(c1.x[c1.f[3][i]-1]+sofax,c1.y[c1.f[3][i]-1]+sofay,c1.z[c1.f[3][i]-1]+sofaz);
glNormal3f(c1.a[c1.f[8][i]-1],c1.b[c1.f[8][i]-1],c1.c[c1.f[8][i]-1]);
glTexCoord2f(c1.m[c1.f[7][i]-1],c1.n[c1.f[7][i]-1]);
glVertex3f(c1.x[c1.f[6][i]-1]+sofax,c1.y[c1.f[6][i]-1]+sofay,c1.z[c1.f[6][i]-1]+sofaz);
}
	glEnd();
	glDisable(GL_TEXTURE_2D);
	glEnable(GL_TEXTURE_2D);
	glBindTexture(GL_TEXTURE_2D,chairtextureId);
	glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
	glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
	glColor3f(1.0f, 1.0f, 1.0f);
	glBegin(GL_TRIANGLES);

for (int i=0;i<c1.k;i++){
glNormal3f(c2.a[c2.f[2][i]-1],c2.b[c2.f[2][i]-1],c2.c[c2.f[2][i]-1]);
glTexCoord2f(c2.m[c2.f[1][i]-1],c2.n[c2.f[1][i]-1]);
glVertex3f(c2.x[c2.f[0][i]-1]+chairx,c2.y[c2.f[0][i]-1]+chairy,c2.z[c2.f[0][i]-1]+chairz);
glNormal3f(c2.a[c2.f[5][i]-1],c2.b[c2.f[5][i]-1],c2.c[c2.f[5][i]-1]);
glTexCoord2f(c2.m[c2.f[4][i]-1],c2.n[c2.f[4][i]-1]);
glVertex3f(c2.x[c2.f[3][i]-1]+chairx,c2.y[c2.f[3][i]-1]+chairy,c2.z[c2.f[3][i]-1]+chairz);
glNormal3f(c2.a[c2.f[8][i]-1],c2.b[c2.f[8][i]-1],c2.c[c2.f[8][i]-1]);
glTexCoord2f(c2.m[c2.f[7][i]-1],c2.n[c2.f[7][i]-1]);
glVertex3f(c2.x[c2.f[6][i]-1]+chairx,c2.y[c2.f[6][i]-1]+chairy,c2.z[c2.f[6][i]-1]+chairz);
}
	glEnd();
	glDisable(GL_TEXTURE_2D);
	glEnable(GL_TEXTURE_2D);
	glBindTexture(GL_TEXTURE_2D,bedtextureId);
	glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
	glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
	glColor3f(1.0f, 1.0f, 1.0f);
	glBegin(GL_TRIANGLES);

for (int i=0;i<c1.k;i++){
glNormal3f(c3.a[c3.f[2][i]-1],c3.b[c3.f[2][i]-1],c3.c[c3.f[2][i]-1]);
glTexCoord2f(c3.m[c3.f[1][i]-1],c3.n[c3.f[1][i]-1]);
glVertex3f(c3.x[c3.f[0][i]-1]+bedx,c3.y[c3.f[0][i]-1]+bedy,c3.z[c3.f[0][i]-1]+bedz);
glNormal3f(c3.a[c3.f[5][i]-1],c3.b[c3.f[5][i]-1],c3.c[c3.f[5][i]-1]);
glTexCoord2f(c3.m[c3.f[4][i]-1],c3.n[c3.f[4][i]-1]);
glVertex3f(c3.x[c3.f[3][i]-1]+bedx,c3.y[c3.f[3][i]-1]+bedy,c3.z[c3.f[3][i]-1]+bedz);
glNormal3f(c3.a[c3.f[8][i]-1],c3.b[c3.f[8][i]-1],c3.c[c3.f[8][i]-1]);
glTexCoord2f(c3.m[c3.f[7][i]-1],c3.n[c3.f[7][i]-1]);
glVertex3f(c3.x[c3.f[6][i]-1]+bedx,c3.y[c3.f[6][i]-1]+bedy,c3.z[c3.f[6][i]-1]+bedz);
}
	glEnd();
	glDisable(GL_TEXTURE_2D);
	//floor
glBegin(GL_QUADS);
glColor3f(0.89f,0.85f,0.70f);
glNormal3f(0,1,0);
glVertex3f(15,0,-10);
glVertex3f(-15,0,-10);
glVertex3f(-15,0,10);
glVertex3f(15,0,10);

glColor3f(0.98f,0.99f,0.70f);
glNormal3f(1,0,0);
glVertex3f(15,0,-10);
glVertex3f(15,10,-10);
glVertex3f(15,10,10);
glVertex3f(15,0,10);

glColor3f(0.98f,0.99f,0.70f);
glNormal3f(0,0,-1);
glVertex3f(15,0,-10);
glVertex3f(15,10,-10);
glVertex3f(-15,10,-10);
glVertex3f(-15,0,-10);

glColor3f(0.98f,0.99f,0.70f);
glNormal3f(-1,0,0);
glVertex3f(-15,0,-10);
glVertex3f(-15,10,-10);
glVertex3f(-15,10,10);
glVertex3f(-15,0,10);

glColor3f(0.98f,0.99f,0.70f);
glNormal3f(0,0,1);
glVertex3f(15,0,10);
glVertex3f(15,10,10);
glVertex3f(-15,10,10);
glVertex3f(-15,0,10);

glEnd();

	glutSwapBuffers();
}

//Called every 25 milliseconds
void update(int value) {
	_angle += 1.0f;
	if (_angle > 360) {
		_angle -= 360;
	}
	glutPostRedisplay();
	glutTimerFunc(25, update, 0);
}

int main(int argc, char** argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
	glutInitWindowSize(400, 400);

	glutCreateWindow("Stall");
	initRendering();

	glutDisplayFunc(drawScene);
	glutKeyboardFunc(handleKeypress);
	glutReshapeFunc(handleResize);
	glutTimerFunc(25, update, 0);

	glutMainLoop();
	return 0;
}
