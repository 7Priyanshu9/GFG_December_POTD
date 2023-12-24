class Day24{
    public:
    int buyMaximumProducts(int n, int k, int price[]){
     
     vector<pair<int,int>>v;
       int c = 0;
       
       for(int i=0;i<n;i++)
       {
           v.push_back({price[i],i+1});
       }
       
       sort(v.begin(),v.end());
       
       for(int i=0;i<n && k>0;i++)
       {
           if((v[i].first * v[i].second)<=k)
           {
               c += v[i].second;
               k -= (v[i].first * v[i].second);
           }
           else
           {
               int a = v[i].first;
               int r = k/a;
               
               c += r;
               k -= (a*r);
           }
       }
       return c;
    }
};
