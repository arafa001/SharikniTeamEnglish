package rta.ae.sharekni.MainNavigationDrawerFragment;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pkmmte.view.CircularImageView;

import rta.ae.sharekni.Arafa.Activities.BestDriversBeforeLogin;
import rta.ae.sharekni.Arafa.Activities.BestRideBeforeLogin;
import rta.ae.sharekni.DriverAlertsForRequest;
import rta.ae.sharekni.EditProfileTest;
import rta.ae.sharekni.OnBoardDir.OnboardingActivity;
import rta.ae.sharekni.QSearch;
import rta.ae.sharekni.R;


public class NavigationDrawerFragment extends Fragment {


  public static   CircularImageView circularImageView;


    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mrecyclerView;

    public  static  RelativeLayout  navy_Change_lang;



    String Navy_Photo_Path;

    private ActionBarDrawerToggle mdrawerToggle;
    private DrawerLayout mdrawerLayout;



    private View containerView;

    public NavigationDrawerFragment() {
        // Required empty public constructor
    }


   public static TextView Convert_txt_id;
    public static ImageView menuicon12;
   public  static  RelativeLayout navy_My_vehicles;
    RelativeLayout navy_homePage,navy_TopRides,navy_BestDrivers,navy_SearchOptions,navy_MyProfile,navy_Logout,navy_Edit_Profile;
  public static   TextView tv_name_home ,nat_home;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View layout = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
//        navy_homePage= (RelativeLayout) layout.findViewById(R.id.navy_homePage);
        navy_TopRides= (RelativeLayout) layout.findViewById(R.id.navy_TopRides);
        navy_BestDrivers= (RelativeLayout) layout.findViewById(R.id.navy_BestDrivers);
        navy_SearchOptions= (RelativeLayout) layout.findViewById(R.id.navy_SearchOptions);
        navy_MyProfile= (RelativeLayout) layout.findViewById(R.id.navy_MyProfile);
        navy_Logout= (RelativeLayout) layout.findViewById(R.id.navy_Logout);
        tv_name_home= (TextView) layout.findViewById(R.id.tv_name_home);
        nat_home= (TextView) layout.findViewById(R.id.nat_home);
        navy_Edit_Profile= (RelativeLayout) layout.findViewById(R.id.navy_Edit_Profile);
        navy_Change_lang = (RelativeLayout) layout.findViewById(R.id.navy_Change_lang);

        navy_My_vehicles= (RelativeLayout) layout.findViewById(R.id.navy_My_vehicles);
        menuicon12= (ImageView) layout.findViewById(R.id.menuicon12);
        Convert_txt_id = (TextView) layout.findViewById(R.id.Convert_txt_id);







        navy_TopRides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BestRideBeforeLogin.class);
                startActivity(intent);
            }
        });



        navy_BestDrivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BestDriversBeforeLogin.class);
                startActivity(intent);
            }
        });


        navy_SearchOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), QSearch.class);
                startActivity(intent);
            }
        });



        navy_MyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), DriverAlertsForRequest.class);
                startActivity(intent);
            }
        });

        navy_Edit_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EditProfileTest.class);
                startActivity(intent);
            }
        });



        navy_Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences myPrefs = getContext().getSharedPreferences("myPrefs", 0);
                SharedPreferences.Editor editor = myPrefs.edit();
                editor.putString("account_id", null);
                editor.putString("account_type","");
                editor.commit();
                Intent in = new Intent(getContext(), OnboardingActivity.class);
                in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(in);
            }


        });





        circularImageView = (CircularImageView)layout.findViewById(R.id.navy);
        circularImageView.setBorderWidth(5);
        circularImageView.setSelectorStrokeWidth(5);
        circularImageView.addShadow();

//        if (!HomePage.ImagePhotoPath.equals("")) {
//            Navy_Photo_Path = HomePage.ImagePhotoPath;
//            ImageDecoder im = new ImageDecoder();
//            im.stringRequest(Navy_Photo_Path, circularImageView, getContext());
//            Log.d("test navy", Navy_Photo_Path);
//
//        }else {
//            Log.d("test navy","blank");
//
//        }




        //mrecyclerView = (RecyclerView) layout.findViewById(R.id.drawer_list);

      //  mrecyclerView.setHasFixedSize(true);
//
//        // use a linear layout manager
//        mLayoutManager = new LinearLayoutManager(getActivity());
//        mrecyclerView.setLayoutManager(mLayoutManager);
//
//        final DataListModel[] dataListModel = new DataListModel[7];
//3
//        DataListModel object1 = new DataListModel();
//        object1.setTitle("Top Rides");
//        object1.setImage(R.drawable.ic_launcher);
//        dataListModel[0]=object1;
//
//
//        DataListModel object2 =  new DataListModel();
//        object2.setTitle("Top Drivers");
//        object2.setImage(R.drawable.ic_launcher);
//        dataListModel[1]=object2;
//
//
//        DataListModel object3 =  new DataListModel();
//        object3.setTitle("My Profile");
//        object3.setImage(R.drawable.ic_launcher);
//        dataListModel[2]=object3;
//
//        DataListModel object4 =  new DataListModel();
//        object4.setTitle("Nezar");
//        object4.setImage(R.drawable.ic_launcher);
//        dataListModel[3]=object4;
//
//
//        DataListModel object5 =  new DataListModel();
//        object5.setTitle("Nezar");
//        object5.setImage(R.drawable.ic_launcher);
//        dataListModel[4]=object5;
//
//
//        DataListModel objecct6 =  new DataListModel();
//        objecct6.setTitle("Nezar");
//        objecct6.setImage(R.drawable.ic_launcher);
//        dataListModel[5]=objecct6;
//
//        DataListModel object7 =  new DataListModel();
//        object7.setTitle("Nezar");
//        object7.setImage(R.drawable.ic_launcher);
//        dataListModel[6]=object7;
//
//
//
//
//
//
//        // specify an adapter (see also next example)
//        mAdapter = new MyAdapter(dataListModel);
//        mrecyclerView.setAdapter(mAdapter);
//
//
//

        return layout;



    } // on create view






    //  1. First create setUp void   with 3 parameters
    // Fragment id   +  DrawerLayout  + Toolbar
    //call the two methods onDrawerOpened   + onDrawerClosed
    // at the onDrawerOpened we check if the user knows about our drawer if not  : equal it to true
    // and then save this variable to the void saveToPreference
    //finally call invalidateOptionsMenu from getActivity  ...


    // the onDrawerSlide void is used to measure the slide offset
    // in other words as i drag the navigation drawer as the toolbar get fade away but not to be completely invisible
    // we use the setAlpha method



    // after the 3  methods OnDrawer(OPened  -  Closed  - Slide)  we check the 2 variable mUserlearned + mSavedInstance
    // if  not open the drawer with the container view variable which has the fragment id passed through the setUp Void first parameter


    // at the onCreate method we checck the Preference through the readFromPreferrencce void








    public void setUp(int fragmentId,DrawerLayout drawerLayout, final Toolbar toolbar) {
        containerView =  getActivity().findViewById(fragmentId);
        mdrawerLayout = drawerLayout;
        mdrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_colse) {

            @Override
            public void onDrawerOpened(View drawerView) {
                    super.onDrawerOpened(drawerView);


                getActivity().invalidateOptionsMenu();

            }


            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

                getActivity().invalidateOptionsMenu();
            }


            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                Log.d("Nezar","offset"+slideOffset);
                if (slideOffset<0.6) {
                    toolbar.setAlpha(1 - slideOffset);
                }

            }
        };





        mdrawerLayout.setDrawerListener(mdrawerToggle);

        mdrawerLayout.post(new Runnable() {
            @Override
            public void run() {

                mdrawerToggle.syncState();
            }
        });

    } //  set up








}
